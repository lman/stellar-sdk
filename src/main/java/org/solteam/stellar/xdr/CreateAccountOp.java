// Automatically generated by xdrgen 
// DO NOT EDIT or your changes may be overwritten

package org.solteam.stellar.xdr;


import java.io.IOException;

// === xdr source ============================================================

//  struct CreateAccountOp
//  {
//      AccountID destination; // account to create
//      int64 startingBalance; // amount they end up with
//  };

//  ===========================================================================
public class CreateAccountOp  {
  public CreateAccountOp () {}
  private AccountID destination;
  public AccountID getDestination() {
    return this.destination;
  }
  public void setDestination(AccountID value) {
    this.destination = value;
  }
  private Int64 startingBalance;
  public Int64 getStartingBalance() {
    return this.startingBalance;
  }
  public void setStartingBalance(Int64 value) {
    this.startingBalance = value;
  }
  public static void encode(XdrDataOutputStream stream, CreateAccountOp encodedCreateAccountOp) throws IOException{
    AccountID.encode(stream, encodedCreateAccountOp.destination);
    Int64.encode(stream, encodedCreateAccountOp.startingBalance);
  }
  public static CreateAccountOp decode(XdrDataInputStream stream) throws IOException {
    CreateAccountOp decodedCreateAccountOp = new CreateAccountOp();
    decodedCreateAccountOp.destination = AccountID.decode(stream);
    decodedCreateAccountOp.startingBalance = Int64.decode(stream);
    return decodedCreateAccountOp;
  }
}
