package in.kamlesh.Onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.kamlesh.Onlinebookstore.entity.Book;

public interface BookRepository extends JpaRepository<Book,Long>  
{

}
