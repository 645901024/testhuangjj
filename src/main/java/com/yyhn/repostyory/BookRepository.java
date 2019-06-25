package com.yyhn.repostyory;

import com.yyhn.pojo.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@RepositoryRestResource(path = "bs")
@CrossOrigin
public interface BookRepository extends JpaRepository<Book,Integer> {

    @RestResource(path = "author",rel = "author")
    List<Book> findByAuthorContains(@Param("author")String author);
}
