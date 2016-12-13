package org.ff4j.security;

import java.util.HashSet;
import java.util.Set;

import org.ff4j.FF4jEntity;

public class FF4jUser extends FF4jEntity < FF4jUser > {
   
    /** serialVersionUID. */
    private static final long serialVersionUID = 7083552676589401961L;
    
    private String firstName;
    
    private String lastName;
    
    /** Groups can be retrieved from LDAP... */
    private Set < String > groups = new HashSet<>();
    
    /** Associated dedicated role to this user (super user). */
    private Set < FF4jRole > roles = new HashSet<>();
    
    /** Associated dedicated permission (super user). */
    private Set < FF4jPermission > permissions = new HashSet<>();
    
    /**
     * Create a user by its userName.
     *
     * @param uid
     *      user unique identifier
     */
    protected FF4jUser(String uid) {
        super(uid);
    }
    
    /**
     * Getter accessor for attribute 'firstName'.
     *
     * @return
     *       current value of 'firstName'
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Setter accessor for attribute 'firstName'.
     * @param firstName
     * 		new value for 'firstName '
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Getter accessor for attribute 'lastName'.
     *
     * @return
     *       current value of 'lastName'
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Setter accessor for attribute 'lastName'.
     * @param lastName
     * 		new value for 'lastName '
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Getter accessor for attribute 'permissions'.
     *
     * @return
     *       current value of 'permissions'
     */
    public Set<FF4jPermission> getPermissions() {
        return permissions;
    }

    /**
     * Setter accessor for attribute 'permissions'.
     * @param permissions
     * 		new value for 'permissions '
     */
    public void setPermissions(Set<FF4jPermission> permissions) {
        this.permissions = permissions;
    }

    /**
     * Getter accessor for attribute 'groups'.
     *
     * @return
     *       current value of 'groups'
     */
    public Set<String> getGroups() {
        return groups;
    }

    /**
     * Setter accessor for attribute 'groups'.
     * @param groups
     * 		new value for 'groups '
     */
    public void setGroups(Set<String> groups) {
        this.groups = groups;
    }

    /**
     * Getter accessor for attribute 'roles'.
     *
     * @return
     *       current value of 'roles'
     */
    public Set<FF4jRole> getRoles() {
        return roles;
    }

    /**
     * Setter accessor for attribute 'roles'.
     * @param roles
     * 		new value for 'roles '
     */
    public void setRoles(Set<FF4jRole> roles) {
        this.roles = roles;
    }
    
}