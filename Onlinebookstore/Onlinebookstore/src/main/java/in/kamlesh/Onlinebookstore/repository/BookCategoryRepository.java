package in.kamlesh.Onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import in.kamlesh.Onlinebookstore.entity.BookCategory;


@RepositoryRestResource(collectionResourceRel="bookCategory",path="book-Category")
public interface BookCategoryRepository extends JpaRepository<BookCategory,Long> {

}
