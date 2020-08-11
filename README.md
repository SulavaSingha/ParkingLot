# ParkingLot
ParkingLot Design
1.Created basic datamodels for required entities
2.Created two services
	2.a TicketGenerationService -> takes care of end to end lifecycle of reservation
	2.b SlotAllocationService -> takes care of mapping cars with slots, slot reservation and release states
3.Created Custom Exception for Error handling and logging purposes.
4.Added test cases for both services (In order to keep build simple, have not used junit etc)
5.Created ParkingLotServer class which acts as anchor for start of application.
6.Due to lack of time, could not create command line interfaces.
