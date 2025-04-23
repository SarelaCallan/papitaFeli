
import { useEffect, useState } from 'react';

function App() {
  const [mensaje, setMensaje] = useState('');

  useEffect(() => {
    fetch('http://localhost:8080/api/saludo')
      .then(res => res.text())
      .then(data => setMensaje(data))
      .catch((err) => console.error("Error:", err));
  }, []);

  return (
    <div>
      <h1>{mensaje}</h1>
    </div>
  );
}

export default App;
