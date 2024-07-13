package com.example.clone_Facebook.DTO;

public class UserPostDTO {
    private int idUserPost;
    private int idUser;
    private int idPost;
    private int isManPoster;
    private int isDeleted;
    public UserPostDTO() {}

    public UserPostDTO(int idUserPost, int idUser, int idPost, int isManPoster, int isDeleted) {
        this.idUserPost = idUserPost;
        this.idUser = idUser;
        this.idPost = idPost;
        this.isManPoster = isManPoster;
        this.isDeleted = isDeleted;
    }

    public int getIdUserPost() {
        return idUserPost;
    }

    public void setIdUserPost(int idUserPost) {
        this.idUserPost = idUserPost;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdPost() {
        return idPost;
    }

    public void setIdPost(int idPost) {
        this.idPost = idPost;
    }

    public int getIsManPoster() {
        return isManPoster;
    }

    public void setIsManPoster(int isManPoster) {
        this.isManPoster = isManPoster;
    }

    public int getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(int isDeleted) {
        this.isDeleted = isDeleted;
    }
}
