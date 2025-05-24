package com.seuprojeto.nomesistema.repository;

import com.seuprojeto.nomesistema.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
