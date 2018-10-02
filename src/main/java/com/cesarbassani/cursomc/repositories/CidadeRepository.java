package com.cesarbassani.cursomc.repositories;

import com.cesarbassani.cursomc.domain.Categoria;
import com.cesarbassani.cursomc.domain.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer> {
}
