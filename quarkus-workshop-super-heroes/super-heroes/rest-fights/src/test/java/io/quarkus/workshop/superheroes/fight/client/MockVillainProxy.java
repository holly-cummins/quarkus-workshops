package io.quarkus.workshop.superheroes.fight.client;

import io.quarkus.test.Mock;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@Mock
@ApplicationScoped
@RestClient
public class MockVillainProxy implements VillainProxy {

    @Inject
    DefaultTestVillain villain;

    @Override
    public Villain findRandomVillain() {
        return villain;
    }
}
