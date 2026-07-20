import './App.css';
import { CohortsData } from './Components/Cohort';
import CohortDetails from './Components/CohortDetails';

function App() {
  return (
    <div>
      <h1>Cohorts Details</h1>

      {CohortsData.map((cohort, index) => (
        <CohortDetails key={index} cohort={cohort} />
      ))}
    </div>
  );
}

export default App;