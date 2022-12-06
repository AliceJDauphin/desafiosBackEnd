const express = require("express");
const router = express.Router();

router.get("/", (req, res, next) => {
        res.status(200).send({
            massagem: "como fazer uma massagem"
        });
});

router.post("/", (req, res, next) => {
        res.status(201).send({
            massagem: "você fez errado >:C"
        });
});

module.exports = router;