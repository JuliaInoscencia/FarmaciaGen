package com.farmarcia.FarmaciaGen.Repository;
/*
 * @author Júlia I. O. dos Santos
 * @since 25/01/2022
 * @version 0.01
 */

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.farmarcia.FarmaciaGen.Model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	public List<Produto>findAllByNomeContainingIgnoreCase(String nome);	

}
