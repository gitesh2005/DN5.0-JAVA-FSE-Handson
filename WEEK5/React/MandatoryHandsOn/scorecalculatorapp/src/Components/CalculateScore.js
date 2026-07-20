import "../Stylesheets/mystyle.css";

function CalculateScore(props) {

    const average = (props.total / props.goal) * 100;

    return (
        <div className="container">
            <h1>Student Score Calculator</h1>

            <h2>Name : {props.name}</h2>

            <h2>School : {props.school}</h2>

            <h2>Total Marks : {props.total}</h2>

            <h2>Maximum Marks : {props.goal}</h2>

            <h2>Average Score : {average.toFixed(2)}%</h2>
        </div>
    );
}

export default CalculateScore;