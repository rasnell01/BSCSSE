//init
const express = require("express");
const cors = require("cors");
const app = express();

//middleware
app.use(cors());

//routes
app.get("/api/message", (req, res) => {
    res.json({message: "Hi my name is what? My name is who?"})
});

//run
const PORT = process.env.PORT || 3000;
app.listen(PORT, () => {
    console.log(`Listening on ${PORT}`);
});
