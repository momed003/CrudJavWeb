package model;

import java.sql.Timestamp;

/**
 *
 * @author yassimin
 */
public class UserModel {

    private int id;
    private String username;
    private String email;
    private Timestamp created_at;
    private Timestamp updated_at;
    private Timestamp deleted_at;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

    public Timestamp getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Timestamp updated_at) {
        this.updated_at = updated_at;
    }

    public Timestamp getDeleted_at() {
        return deleted_at;
    }

    public void setDeleted_at(Timestamp deleted_at) {
        this.deleted_at = deleted_at;
    }

    @Override
    public String toString() {
        return "UserModel{" + "id=" + id + ", username=" + username + ", email=" + email + ", created_at=" + created_at + ", updated_at=" + updated_at + ", deleted_at=" + deleted_at + '}';
    }

}
