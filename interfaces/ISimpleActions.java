package interfaces;

import entities.Entity;

public interface ISimpleActions {
     void lookAt(Entity entity);
     void stand();
     void waiting(String expectedEvent);
     void breathTaking();
}
