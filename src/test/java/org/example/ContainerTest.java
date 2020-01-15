package org.example;

import org.junit.Rule;
import org.junit.Test;
import org.testcontainers.containers.GenericContainer;

import static org.assertj.core.api.Assertions.assertThat;

public class ContainerTest {
    @Rule
    public final GenericContainer container = new GenericContainer<>("mongo:4.0");

    @Test
    public void testContainers() {
        assertThat(container.getContainerId().length()).isEqualTo(64);
    }
}
