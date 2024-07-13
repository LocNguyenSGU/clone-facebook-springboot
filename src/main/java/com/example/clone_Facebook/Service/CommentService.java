package com.example.clone_Facebook.Service;

import com.example.clone_Facebook.DTO.CommentDTO;
import com.example.clone_Facebook.Entity.Comment;
import com.example.clone_Facebook.Repository.CommentRepository;
import com.example.clone_Facebook.Service.Imp.CommentServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CommentService implements CommentServiceImp {
    @Autowired
    private CommentRepository commentRepository;
    @Override
    public List<CommentDTO> getCommentsByIdPost(int idPost) {
        List<Comment> commentList = commentRepository.findByPost_idPost(idPost);
        List<CommentDTO> commentDTOList = new ArrayList<>();
        for(Comment comment : commentList) {
            CommentDTO commentDTO = new CommentDTO();
            commentDTO.setIdComment(comment.getIdComment());
            commentDTO.setContent(comment.getContent());
            commentDTO.setCreateAt(comment.getCreateAt());
            commentDTO.setUpdateAt(comment.getUpdateAt());
            commentDTO.setIdParentComment(comment.getIdParentComment());
            commentDTO.setIsDeleted(comment.getIsDeleted());
            commentDTO.setNumberEmotion(comment.getNumberEmotion());
            commentDTO.setNumberReply(comment.getNumberReply());
            commentDTO.setIdPost(comment.getPost().getIdPost());
            commentDTOList.add(commentDTO);
        }
        return commentDTOList;
    }
}
