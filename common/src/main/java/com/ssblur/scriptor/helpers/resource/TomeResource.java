package com.ssblur.scriptor.helpers.resource;

import com.ssblur.scriptor.error.WordNotFoundException;
import com.ssblur.scriptor.registry.words.WordRegistry;
import com.ssblur.scriptor.word.PartialSpell;
import com.ssblur.scriptor.word.Spell;
import com.ssblur.scriptor.word.action.Action;
import com.ssblur.scriptor.word.descriptor.Descriptor;
import com.ssblur.scriptor.word.subject.Subject;

import java.util.ArrayList;
import java.util.List;

public class TomeResource {
  public static class PartialSpellResource {
    String action;
    List<String> descriptors;
    public PartialSpellResource(String action, List<String> descriptors) {
      this.action = action;
      this.descriptors = descriptors;
    }
  }
  public static class SpellResource {
    String subject;
    List<PartialSpellResource> spells;
    public SpellResource(String subject, List<PartialSpellResource> spells) {
      this.subject = subject;
      this.spells = spells;
    }
  }

  String name;
  boolean disabled = false;
  String author;
  SpellResource spell;
  int tier;

  public boolean isDisabled() {
    return disabled;
  }

  public String getAuthor() {
    return author;
  }

  public String getName() {
    return name;
  }
  public int getTier() { return tier; }

  public Spell getSpell() {
    List<PartialSpell> spells = new ArrayList<>();

    for(var spell: spell.spells) {
      Action action = WordRegistry.INSTANCE.actionRegistry.get(spell.action);
      if (action == null)
        throw new WordNotFoundException(spell.action);

      ArrayList<Descriptor> descriptors = new ArrayList<>();
      for (String string : spell.descriptors) {
        Descriptor descriptor = WordRegistry.INSTANCE.descriptorRegistry.get(string);
        if (descriptor == null)
          throw new WordNotFoundException(string);
        descriptors.add(descriptor);
      }

      spells.add(new PartialSpell(action, descriptors.toArray(Descriptor[]::new)));
    }

    Subject subject = WordRegistry.INSTANCE.subjectRegistry.get(spell.subject);
    if(subject == null)
      throw new WordNotFoundException(spell.subject);

    return new Spell(subject, spells.toArray(PartialSpell[]::new));
  }
}
