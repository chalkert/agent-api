package ca.gc.aafc.agent.api.repository;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import ca.gc.aafc.agent.api.dto.AgentDto;
import ca.gc.aafc.agent.api.entities.Agent;
import ca.gc.aafc.dina.jpa.DinaService;
import ca.gc.aafc.dina.mapper.DinaMapper;
import ca.gc.aafc.dina.repository.DinaRepository;
import lombok.NonNull;

@Component
public class AgentDinaRepo extends DinaRepository<AgentDto, Agent> {


  public AgentDinaRepo(@NonNull DinaService<Agent> dinaService) {
    super(
        dinaService,
        new DinaMapper<>(AgentDto.class, Agent.class, new ArrayList<>(), new ArrayList<>()),
        AgentDto.class,
        Agent.class
    );
  }

}
