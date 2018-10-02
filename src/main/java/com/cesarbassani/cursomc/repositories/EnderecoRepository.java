package com.cesarbassani.cursomc.repositories;

import com.cesarbassani.cursomc.domain.Categoria;
import com.cesarbassani.cursomc.domain.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {
}
