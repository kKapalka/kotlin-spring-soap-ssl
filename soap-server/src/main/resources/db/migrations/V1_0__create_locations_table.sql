CREATE TABLE locations
(
    id                       uuid DEFAULT random_uuid() not null,
    name                     text                       not null,
    description              text                       not null,
    treasure_chest_amount    bigint                     not null
    PRIMARY KEY (id)
);