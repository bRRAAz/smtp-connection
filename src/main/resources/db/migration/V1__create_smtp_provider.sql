CREATE TABLE smtp_provider(
    id SERIAL PRIMARY KEY,
    provider_name TEXT,
    host TEXT NOT NULL,
    port INTEGER NOT NULL,
    username VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL
)