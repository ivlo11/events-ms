package io.devwidgets.events.application.service;

import io.devwidgets.events.api.dto.EventDto;
import io.devwidgets.events.application.service.impl.EventServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class EventServiceImplTest {
  private IEventService service;

  @BeforeEach
  public void setup() {
    service = new EventServiceImpl();
  }

  @Test
  public void getEvent() {
    EventDto event = service.getEvent(null);
    assertNotNull(event);
  }

  @Test
  public void getEventDetails() {
    EventDto event = service.getEvent(null);
    assertEquals("The Event is now!", event.getDescription());
    assertEquals(OffsetDateTime.parse("2027-12-03T10:15:30+01:00"), event.getDate());
  }


  @Test
  public void getEvents() {
    List<EventDto> events = service.getEvents();
    assertNotNull(events);
  }

  @Test
  public void getEventsDetails() {
    List<EventDto> events = service.getEvents();
    assertEquals(1, events.size());
    assertEquals("The Event is now!", events.get(0).getDescription());
    assertEquals(OffsetDateTime.parse("2027-12-03T10:15:30+01:00"), events.get(0).getDate());
  }

}
