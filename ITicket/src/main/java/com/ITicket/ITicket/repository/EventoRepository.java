
package com.ITicket.ITicket.repository;

import com.ITicket.ITicket.entity.Evento;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface EventoRepository extends JpaRepository<Evento,Long>{
    
}
