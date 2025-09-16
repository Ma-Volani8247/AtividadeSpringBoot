package psii.senai.spring_boot_produto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import psii.senai.spring_boot_produto.model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

}
