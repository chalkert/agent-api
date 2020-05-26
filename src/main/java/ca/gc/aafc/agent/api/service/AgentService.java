package ca.gc.aafc.agent.api.service;

import org.springframework.stereotype.Service;

import ca.gc.aafc.agent.api.entities.Agent;
import ca.gc.aafc.dina.jpa.BaseDAO;
import ca.gc.aafc.dina.jpa.DinaService;
import lombok.NonNull;

@Service
public class AgentService extends DinaService<Agent> {

  public AgentService(@NonNull BaseDAO baseDAO) {
    super(baseDAO);
  }

  @Override
  protected Agent preCreate(Agent entity) {
    return entity;
  }

  @Override
  protected void preDelete(Agent entity) {
    // TODO Auto-generated method stub
  }

  @Override
  protected Agent preUpdate(Agent entity) {
    // TODO Auto-generated method stub
    return null;
  }

}
