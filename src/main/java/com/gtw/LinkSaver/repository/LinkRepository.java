package com.gtw.LinkSaver.repository;

import com.gtw.LinkSaver.model.Link;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LinkRepository extends CrudRepository<Link,Long> {
}
