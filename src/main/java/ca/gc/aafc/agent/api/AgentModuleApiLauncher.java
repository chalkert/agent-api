package ca.gc.aafc.agent.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * Launches the application.
 */
// CHECKSTYLE:OFF HideUtilityClassConstructor (Configuration class can not have
// invisible constructor, ignore the check style error for this case)
@SpringBootApplication
@EnableConfigurationProperties(AgentModuleConfiguration.class)
public class AgentModuleApiLauncher {
  public static void main(String[] args) {
    SpringApplication.run(AgentModuleApiLauncher.class, args);
  }
}
