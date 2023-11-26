package com.ssblur.scriptor.word.descriptor.power;

import com.ssblur.scriptor.damage.ScriptorDamage;
import com.ssblur.scriptor.helpers.targetable.EntityTargetable;
import com.ssblur.scriptor.helpers.targetable.Targetable;
import com.ssblur.scriptor.word.descriptor.CastDescriptor;
import com.ssblur.scriptor.word.descriptor.Descriptor;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.LivingEntity;


public class BloodPowerDescriptor extends Descriptor implements CastDescriptor, StrengthDescriptor {
  @Override
  public Cost cost() { return new Cost(0, COSTTYPE.ADDITIVE_POST); }

  @Override
  public boolean cannotCast(Targetable caster) {
    if(caster instanceof EntityTargetable entityTargetable && entityTargetable.getTargetEntity() instanceof LivingEntity living) {
      living.hurt(ScriptorDamage.sacrifice(living), 1.0f);
      living.invulnerableTime = 0;
      return !living.isAlive();
    }
    return true;
  }

  @Override
  public double strengthModifier() {
    return 2;
  }

  @Override
  public boolean allowsDuplicates() {
    return true;
  }
}
