function Eminem_jumpMenu(targ,selObj,restore){ //v3.0
  eval(targ+".location='"+selObj.options[selObj.selectedIndex].value+"'");
  if (restore) selObj.selectedIndex=0;
}
document.writeln('<option selected>Select a Chapter/Topic</option><option value="index.html">Home Page of this Document</option><option value="contents.html">Table of Contents</option><option value="DevaSearch/search.html">Search Page</option><option value="preface.html">Preface</option><option value="chapter1.html">Chapter 1: Introduction to the JavaSound API</option><option value="chapter2.html">Chapter 2: Overview of the Sampled Package</option><option value="chapter3.html">Chapter 3: Accessing Audio System Resources</option><option value="chapter4.html">Chapter 4: Playing Back Audio</option><option value="chapter5.html">Chapter 5: Capturing Audio</option><option value="chapter6.html">Chapter 6: Processing Audio With Controls</option><option value="chapter7.html">Chapter 7: Using Files and FormatConverters</option><option value="chapter8.html">Chapter 8: Overview of the MIDI Package</option><option value="chapter9.html">Chapter 9: Accessing MIDI Resources</option><option value="chapter10.html">Chapter 10: Transmitting and Receiving MIDI Messages</option><option value="chapter11.html">Chapter 11: Playing, Recording and Editing MIDI Sequences</option><option value="chapter12.html">Chapter 12: Synthesizing Sound</option><option value="chapter13.html">Chapter 13: Introductionto the Service Provider Interfaces</option><option value="chapter14.html">Chapter 14: Providing Sampled-Audio Services</option><option value="chapter15.html">Chapter 15: Providing MIDI Services</option><option value="appendix1.html">Appendix 1: Code Overview: AudioSystem.java</option><option value="appendix2.html">Appendix 2: sound.properties File</option></select>');