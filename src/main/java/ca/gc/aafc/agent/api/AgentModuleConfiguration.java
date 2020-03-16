package ca.gc.aafc.agent.api;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@ConstructorBinding
@ConfigurationProperties(prefix = "agent-module")
public class AgentModuleConfiguration {

  private String defaultLicenceURL;
  private String defaultCopyright;
  private String defaultCopyrightOwner;

  public AgentModuleConfiguration(String defaultLicenceURL, String defaultCopyright, String defaultCopyrightOwner) {
    this.defaultLicenceURL = defaultLicenceURL;
    this.defaultCopyright = defaultCopyright;
    this.defaultCopyrightOwner = defaultCopyrightOwner;
  }

  public String getDefaultLicenceURL() {
    return defaultLicenceURL;
  }

  public String getDefaultCopyright() {
    return defaultCopyright;
  }

  public String getDefaultCopyrightOwner() {
    return defaultCopyrightOwner;
  }

}
