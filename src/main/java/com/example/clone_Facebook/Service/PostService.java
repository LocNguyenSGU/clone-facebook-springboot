package com.example.clone_Facebook.Service;

import com.example.clone_Facebook.DTO.EmotionPostDTO;
import com.example.clone_Facebook.DTO.PostDTO;
import com.example.clone_Facebook.DTO.UserPostDTO;
import com.example.clone_Facebook.Entity.EmotionPost;
import com.example.clone_Facebook.Entity.Post;
import com.example.clone_Facebook.Entity.UserPost;
import com.example.clone_Facebook.Repository.PostRepository;
import com.example.clone_Facebook.Service.Imp.PostServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class PostService implements PostServiceImp {
    @Autowired
    private PostRepository postRepository;
    @Override
    public List<PostDTO> getAllPost() {
        List<Post> postList = postRepository.findAll();
        List<PostDTO> postDTOList = new ArrayList<>();
        for(Post post : postList) {
            PostDTO postDTO = new PostDTO();
            postDTO.setIdPost(post.getIdPost());
            postDTO.setContent(post.getContent());
            postDTO.setCreatedAt(post.getCreateAt());
            postDTO.setNumberComment(post.getNumberComment());
            postDTO.setNumberEmotion(post.getNumberEmotion());
            postDTO.setNumberShare(post.getNumberShare());
            postDTO.setStatus(post.getStatus());
            postDTO.setUpdatedAt(post.getUpdateAt());
            postDTO.setIsDeleted(post.getIsDeleted());
            postDTO.setIdMode(post.getMode().getIdMode());
            final List<UserPostDTO> userPostDTOList = getUserPostDTOList(post);
            final List<EmotionPostDTO> emotionPostDTOList = getEmotionDTOList(post);
            postDTO.setUserPostDTOList(userPostDTOList);
            postDTO.setEmotionPostDTOList(emotionPostDTOList);
            postDTOList.add(postDTO);
        }
        return postDTOList;
    }

    @Override
    public List<PostDTO> findByIsDeletedAndMode_idMode(int isDeleted, int idMode) {
        List<Post> postList = postRepository.findByIsDeletedAndMode_idMode(isDeleted, idMode);
        List<PostDTO> postDTOList = new ArrayList<>();
        for(Post post : postList) {
            PostDTO postDTO = new PostDTO();
            postDTO.setIdPost(post.getIdPost());
            postDTO.setContent(post.getContent());
            postDTO.setCreatedAt(post.getCreateAt());
            postDTO.setNumberComment(post.getNumberComment());
            postDTO.setNumberEmotion(post.getNumberEmotion());
            postDTO.setNumberShare(post.getNumberShare());
            postDTO.setStatus(post.getStatus());
            postDTO.setUpdatedAt(post.getUpdateAt());
            postDTO.setIsDeleted(post.getIsDeleted());
            postDTO.setIdMode(post.getMode().getIdMode());
            final List<UserPostDTO> userPostDTOList = getUserPostDTOList(post);
            final List<EmotionPostDTO> emotionPostDTOList = getEmotionDTOList(post);
            postDTO.setUserPostDTOList(userPostDTOList);
            postDTO.setEmotionPostDTOList(emotionPostDTOList);
            postDTOList.add(postDTO);
        }
        return postDTOList;
    }

    private static List<UserPostDTO> getUserPostDTOList(Post post) {
        List<UserPost> userPostList = post.getUserPostList();
        List<UserPostDTO> userPostDTOList = new ArrayList<>();
        for(UserPost userPost : userPostList) {
            UserPostDTO userPostDTO = new UserPostDTO();
            userPostDTO.setIdUserPost(userPost.getIdUserPost());
            userPostDTO.setIdUser(userPost.getUser().getIdUser());
            userPostDTO.setIdPost(userPost.getPost().getIdPost());
            userPostDTO.setIsManPoster(userPost.getIsManPoster());
            userPostDTO.setIsDeleted(userPost.getIsDeleted());
            userPostDTOList.add(userPostDTO);
        }
        return userPostDTOList;
    }
    private static List<EmotionPostDTO> getEmotionDTOList(Post post) {
        List<EmotionPost> emotionPostList = post.getEmotionPostList();
        List<EmotionPostDTO> emotionPostDTOList = new ArrayList<>();
        for(EmotionPost emotionPost : emotionPostList) {
            EmotionPostDTO emotionPostDTO = new EmotionPostDTO();
            emotionPostDTO.setIdEmotionPost(emotionPost.getIdEmotionPost());
            emotionPostDTO.setIdEmotion(emotionPost.getEmotion().getIdEmotion());
            emotionPostDTO.setCreateAt(emotionPost.getCreateAt());
            emotionPostDTO.setUpdateAt(emotionPost.getUpdateAt());
            emotionPostDTO.setReacterId(emotionPost.getReacter().getIdUser());
            emotionPostDTO.setIsDeleted(emotionPost.getIsDeleted());
            emotionPostDTOList.add(emotionPostDTO);
        }
        return emotionPostDTOList;
    }
}
