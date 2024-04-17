package domain;

import java.io.Serializable;

public class Usuario implements Serializable {

    private int idUsuario;
    private String username;
    private String password;

    public Usuario() {
    }

    public Usuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Usuario(int idUsuario, String username, String password) {
        this.idUsuario = idUsuario;
        this.username = username;
        this.password = password;
    }

    public Usuario(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public int getIdUsuario() {
        return this.idUsuario;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Usuario{");
        sb.append("idUsuario=").append(idUsuario);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append('}');
        return sb.toString();
    }

}
