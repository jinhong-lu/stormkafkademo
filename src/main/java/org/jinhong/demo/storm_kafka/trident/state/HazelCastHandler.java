package org.jinhong.demo.storm_kafka.trident.state;

import com.hazelcast.core.Hazelcast;

import java.io.Serializable;
import java.util.Map;

public class HazelCastHandler implements Serializable {

    private transient Map<String, Long> state;

    public Map<String, Long> getState() {
        if (state == null) {
            state = Hazelcast.newHazelcastInstance().getMap("state");
        }
        return state;
    }
}
