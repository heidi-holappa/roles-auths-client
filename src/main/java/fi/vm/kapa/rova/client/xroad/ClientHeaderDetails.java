package fi.vm.kapa.rova.client.xroad;

import java.util.Properties;

/**
 * Client specific values for XRoad message header.
 */
public class ClientHeaderDetails extends HeaderDetails {

    /**
     * {@value}
     */
    public static final String SDSB_INSTANCE_KEY = "client_sdsb_instance";
    /**
     * {@value}
     */
    public static final String MEMBER_CLASS_KEY = "client_member_class";
    /**
     * {@value}
     */
    public static final String MEMBER_CODE_KEY = "client_member_code";
    /**
     * {@value}
     */
    public static final String SUBSYSTEM_CODE_KEY = "client_subsystem_code";
    /**
     * {@value}
     */
    public static final String VERSION_KEY = "client_version";

    public ClientHeaderDetails(Properties properties) {
        this.sdsbInstance = (String) properties.get(SDSB_INSTANCE_KEY);
        this.subsystemCode = (String) properties.get(SUBSYSTEM_CODE_KEY);
        this.memberClass = (String) properties.get(MEMBER_CLASS_KEY);
        this.memberCode = (String) properties.get(MEMBER_CODE_KEY);
        this.version = (String) properties.get(VERSION_KEY);
    }
}
