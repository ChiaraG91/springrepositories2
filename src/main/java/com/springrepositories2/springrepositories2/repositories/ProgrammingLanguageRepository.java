package com.springrepositories2.springrepositories2.repositories;

import com.springrepositories2.springrepositories2.entities.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "repo-prog-languages")
public interface ProgrammingLanguageRepository extends JpaRepository<ProgrammingLanguage, Long> {
}

