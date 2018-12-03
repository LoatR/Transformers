#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: US_100 Transformer

  @tag1
  Scenario: Creation of a transformer
    Given a Car
    And a Monster
    When a Creature wants
    Then the Car and the Monster merge into a transformer
    And the power of the Transformer is the product of the height of the Monster and the capacity of the Car

  @tag2
  Scenario Outline: Attack of a transformer
    Given two Transformers 
    When we are in a battle
    Then I attack by choosing a strategy