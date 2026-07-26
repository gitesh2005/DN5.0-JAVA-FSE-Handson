import React, { Component } from "react";

class CurrencyConvertor extends Component {
  constructor(props) {
    super(props);

    this.state = {
      amount: "",
      currency: "Euro",
    };
  }

  handleAmount = (e) => {
    this.setState({ amount: e.target.value });
  };

  handleCurrency = (e) => {
    this.setState({ currency: e.target.value });
  };

  handleSubmit = (e) => {
    e.preventDefault();

    const euro = this.state.amount * 80;

    alert("Converting to Euro Amount is " + euro);
  };

  render() {
    return (
      <div>
        <h1 style={{ color: "green" }}>Currency Convertor!!!</h1>

        <form onSubmit={this.handleSubmit}>
          <table>
            <tbody>
              <tr>
                <td>Amount:</td>
                <td>
                  <input
                    type="number"
                    value={this.state.amount}
                    onChange={this.handleAmount}
                  />
                </td>
              </tr>

              <tr>
                <td>Currency:</td>
                <td>
                  <select
                    value={this.state.currency}
                    onChange={this.handleCurrency}
                  >
                    <option>Euro</option>
                  </select>
                </td>
              </tr>

              <tr>
                <td></td>
                <td>
                  <button type="submit">Submit</button>
                </td>
              </tr>
            </tbody>
          </table>
        </form>
      </div>
    );
  }
}

export default CurrencyConvertor;