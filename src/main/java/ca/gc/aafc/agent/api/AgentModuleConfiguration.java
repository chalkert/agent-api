package ca.gc.aafc.agent.api;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@ConstructorBinding
@ConfigurationProperties(prefix = "agent-module")
public class AgentModuleConfiguration {

  public AgentModuleConfiguration() {}

}
