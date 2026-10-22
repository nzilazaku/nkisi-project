CREATE TABLE nkisi (
    id BIGINT NOT NULL AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    via VARCHAR(100) NOT NULL,
    lote VARCHAR(100) NOT NULL,
    quantity INT NOT NULL,
    date_validation DATE NOT NULL,
    laboratory VARCHAR(100) NOT NULL,
    PRIMARY KEY (id)
);

