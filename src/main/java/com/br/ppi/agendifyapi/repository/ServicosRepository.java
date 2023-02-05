package com.br.ppi.agendifyapi.repository;

import com.br.ppi.agendifyapi.model.Servicos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicosRepository extends JpaRepository<Servicos, Long> {
}
