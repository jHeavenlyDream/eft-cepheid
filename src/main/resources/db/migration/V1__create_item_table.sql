CREATE SEQUENCE IF NOT EXISTS item_seq START WITH 1 INCREMENT BY 1 MINVALUE 1 CACHE 1;

CREATE TABLE IF NOT EXISTS items
(
    id          BIGINT       NOT NULL DEFAULT nextval('item_seq'),
    d_type      SMALLINT     NOT NULL,
    name        VARCHAR(255) NOT NULL UNIQUE,
    description VARCHAR(2000),
    created_at  TIMESTAMP             DEFAULT now(),
    updated_at  TIMESTAMP             DEFAULT now(),
    CONSTRAINT item_pk PRIMARY KEY (id)
);

COMMENT ON TABLE items IS 'Предметы';
COMMENT ON COLUMN items.id IS 'Уникальный идентификатор';
COMMENT ON COLUMN items.d_type IS 'Дискрименатор сущности';
COMMENT ON COLUMN items.name IS 'Название';
COMMENT ON COLUMN items.created_at IS 'Дата и время создания';
COMMENT ON COLUMN items.updated_at IS 'Дата и время обновления';