// Automatically generated by xdrgen 
// DO NOT EDIT or your changes may be overwritten

package org.solteam.stellar.xdr;


import java.io.IOException;

// === xdr source ============================================================

//  union SCPHistoryEntry switch (int v)
//  {
//  case 0:
//      SCPHistoryEntryV0 v0;
//  };

//  ===========================================================================
public class SCPHistoryEntry  {
  public SCPHistoryEntry () {}
  Integer v;
  public Integer getDiscriminant() {
    return this.v;
  }
  public void setDiscriminant(Integer value) {
    this.v = value;
  }
  private SCPHistoryEntryV0 v0;
  public SCPHistoryEntryV0 getV0() {
    return this.v0;
  }
  public void setV0(SCPHistoryEntryV0 value) {
    this.v0 = value;
  }
  public static void encode(XdrDataOutputStream stream, SCPHistoryEntry encodedSCPHistoryEntry) throws IOException {
  stream.writeInt(encodedSCPHistoryEntry.getDiscriminant().intValue());
  switch (encodedSCPHistoryEntry.getDiscriminant()) {
  case 0:
  SCPHistoryEntryV0.encode(stream, encodedSCPHistoryEntry.v0);
  break;
  }
  }
  public static SCPHistoryEntry decode(XdrDataInputStream stream) throws IOException {
  SCPHistoryEntry decodedSCPHistoryEntry = new SCPHistoryEntry();
  Integer discriminant = stream.readInt();
  decodedSCPHistoryEntry.setDiscriminant(discriminant);
  switch (decodedSCPHistoryEntry.getDiscriminant()) {
  case 0:
  decodedSCPHistoryEntry.v0 = SCPHistoryEntryV0.decode(stream);
  break;
  }
    return decodedSCPHistoryEntry;
  }
}
