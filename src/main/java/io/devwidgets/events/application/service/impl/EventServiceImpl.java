package io.devwidgets.events.application.service.impl;

import io.devwidgets.events.api.dto.EventDto;
import io.devwidgets.events.application.service.IEventService;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class EventServiceImpl implements IEventService {

  @Override
  public EventDto getEvent(String id) {
    return creatStubbedEventDto();
  }

  @Override
  public List<EventDto> getEvents() {
    ArrayList<EventDto> eventDtos = new ArrayList<>();
    EventDto eventDto = creatStubbedEventDto();
    eventDtos.add(eventDto);
    return eventDtos;
  }

  private EventDto creatStubbedEventDto() {
    EventDto eventDto = new EventDto();
    eventDto.setDescription("The Event is now!");
    eventDto.setDate(OffsetDateTime.parse("2027-12-03T10:15:30+01:00"));
    return eventDto;
  }
}
