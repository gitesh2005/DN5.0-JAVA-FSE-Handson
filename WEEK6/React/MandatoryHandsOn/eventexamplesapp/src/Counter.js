import React, { Component } from "react";

class Counter extends Component {
  state = {
    count: 0,
  };

  increment = () => {
    this.setState({ count: this.state.count + 1 });
    this.sayHello();
  };

  decrement = () => {
    this.setState({ count: this.state.count - 1 });
  };

  sayHello = () => {
    alert("Hello");
  };

  sayWelcome = (msg) => {
    alert(msg);
  };

  onPress = () => {
    alert("I was clicked");
  };

  render() {
    return (
      <div>
        <h3>{this.state.count}</h3>

        <button onClick={this.increment}>Increment</button>
        <br />

        <button onClick={this.decrement}>Decrement</button>
        <br />

        <button onClick={() => this.sayWelcome("Welcome")}>
          Say welcome
        </button>
        <br />

        <button onClick={this.onPress}>Click on me</button>
      </div>
    );
  }
}

export default Counter;