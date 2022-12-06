const express = require ("express");
const app = express();

const rotaForum = require("./routes/foruns");

app.use("/foruns", rotaForum);

app.use((req, res, next) => {
        res.status(200).send({
            massagem: 'deu ruim'
        });
});

module.exports = app;