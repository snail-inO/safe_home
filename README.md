# safe_home

A Web App that alerts people for possible crimes

## Features

### Core features

- Danger Level Prediction: using Syracuse Open Data crime history data to predict the danger level of the area around user’s location
- Crime Report: user uploads live crimes to the server (with certain proof, pic, video, etc.)
- Live Crime Alert: based on the user’s report, alert the user whose static address or last address is in a certain range of the crime scene by SMS message (with basic description and the URL of the report)
- Honesty System: User can report a fake alert or confirm a real one. And users have different honesty level based on their activities

### User features

- Multiple monitor address setting
- User’s privilege management (based on honesty level)

## Tech Stack

- Spring Boot
- Spring Security
- Mybatis
- Redis
- Swagger API

## Dependencies

- Database: CockroachDB
- Crime data: Syracuse Open Data
- SMS: Twillio
- Map: Google Map API

## Sprints

### Sprint 1

- Construct the basic framework of the project
- Implement user login & register APIs
