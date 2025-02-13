CREATE TABLE USERS_EVENTS(
	id SERIAL PRIMARY KEY,
	user_id int,
	reciepents JSON,
	created_by int,
	updated_by int,
	event_time timestamp,
	created_at timestamp,
	updated_at timestamp
);