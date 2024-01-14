CREATE TABLE IF NOT EXISTS user_info
(
    id INTEGER PRIMARY KEY GENERATED ALWAYS AS IDENTITY NOT NULL,
    username text NOT NULL,
    password text NOT NULL,
    email text NOT NULL
);