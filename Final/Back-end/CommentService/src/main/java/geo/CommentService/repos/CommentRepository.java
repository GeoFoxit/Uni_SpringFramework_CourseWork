package geo.CommentService.repos;

import geo.CommentService.models.Comment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends CrudRepository<Comment, Integer> {
    Comment getById(Integer id);
}
